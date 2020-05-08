package de.qaware.tools.sqbb.library.api.connector;

import de.qaware.tools.sqbb.library.api.BranchMode;
import de.qaware.tools.sqbb.library.api.ProjectKey;

import java.io.IOException;

/**
 * Connector to SonarQube.
 */
public interface SonarQubeConnector {
    /**
     * Fetches the quality gate status for the given project.
     *
     * @param projectKey project
     * @param branchMode branch mode
     * @return quality gate status
     * @throws IOException        if something went wrong while fetching the status
     * @throws SonarQubeException if SonarQube returned an error
     */
    QualityGateStatus fetchQualityGateStatus(ProjectKey projectKey, BranchMode branchMode) throws IOException, SonarQubeException;

    /**
     * Fetches the analysis tasks for the given projects.
     *
     * @param projectKey project
     * @param branchMode branch mode
     * @return analysis tasks. Contains the tasks in the queue and the last finished task
     * @throws IOException        if something went wrong while fetching the status
     * @throws SonarQubeException if SonarQube returned an error
     */
    AnalysisTasks fetchAnalysisTasks(ProjectKey projectKey, BranchMode branchMode) throws IOException, SonarQubeException;
}
