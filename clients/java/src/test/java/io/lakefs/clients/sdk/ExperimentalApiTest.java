/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.sdk;

import io.lakefs.clients.sdk.ApiException;
import io.lakefs.clients.sdk.model.AbortPresignMultipartUpload;
import io.lakefs.clients.sdk.model.CompletePresignMultipartUpload;
import io.lakefs.clients.sdk.model.Error;
import io.lakefs.clients.sdk.model.ExternalPrincipal;
import io.lakefs.clients.sdk.model.ExternalPrincipalCreation;
import io.lakefs.clients.sdk.model.ExternalPrincipalList;
import io.lakefs.clients.sdk.model.ObjectStats;
import io.lakefs.clients.sdk.model.PresignMultipartUpload;
import io.lakefs.clients.sdk.model.StagingLocation;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExperimentalApi
 */
@Disabled
public class ExperimentalApiTest {

    private final ExperimentalApi api = new ExperimentalApi();

    /**
     * Abort a presign multipart upload
     *
     * Aborts a presign multipart upload.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void abortPresignMultipartUploadTest() throws ApiException {
        String repository = null;
        String branch = null;
        String uploadId = null;
        String path = null;
        AbortPresignMultipartUpload abortPresignMultipartUpload = null;
        api.abortPresignMultipartUpload(repository, branch, uploadId, path)
                .abortPresignMultipartUpload(abortPresignMultipartUpload)
                .execute();
        // TODO: test validations
    }

    /**
     * Complete a presign multipart upload request
     *
     * Completes a presign multipart upload by assembling the uploaded parts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void completePresignMultipartUploadTest() throws ApiException {
        String repository = null;
        String branch = null;
        String uploadId = null;
        String path = null;
        CompletePresignMultipartUpload completePresignMultipartUpload = null;
        ObjectStats response = api.completePresignMultipartUpload(repository, branch, uploadId, path)
                .completePresignMultipartUpload(completePresignMultipartUpload)
                .execute();
        // TODO: test validations
    }

    /**
     * Initiate a multipart upload
     *
     * Initiates a multipart upload and returns an upload ID with presigned URLs for each part (optional). Part numbers starts with 1. Each part except the last one has minimum size depends on the underlying blockstore implementation. For example working with S3 blockstore, minimum size is 5MB (excluding the last part). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPresignMultipartUploadTest() throws ApiException {
        String repository = null;
        String branch = null;
        String path = null;
        Integer parts = null;
        PresignMultipartUpload response = api.createPresignMultipartUpload(repository, branch, path)
                .parts(parts)
                .execute();
        // TODO: test validations
    }

    /**
     * attach external principal to user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserExternalPrincipalTest() throws ApiException {
        String userId = null;
        String principalId = null;
        ExternalPrincipalCreation externalPrincipalCreation = null;
        api.createUserExternalPrincipal(userId, principalId)
                .externalPrincipalCreation(externalPrincipalCreation)
                .execute();
        // TODO: test validations
    }

    /**
     * delete external principal from user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserExternalPrincipalTest() throws ApiException {
        String userId = null;
        String principalId = null;
        api.deleteUserExternalPrincipal(userId, principalId)
                .execute();
        // TODO: test validations
    }

    /**
     * describe external principal by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExternalPrincipalTest() throws ApiException {
        String principalId = null;
        ExternalPrincipal response = api.getExternalPrincipal(principalId)
                .execute();
        // TODO: test validations
    }

    /**
     * hard reset branch
     *
     * Relocate branch to refer to ref.  Branch must not contain uncommitted data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void hardResetBranchTest() throws ApiException {
        String repository = null;
        String branch = null;
        String ref = null;
        Boolean force = null;
        api.hardResetBranch(repository, branch, ref)
                .force(force)
                .execute();
        // TODO: test validations
    }

    /**
     * list user external policies attached to a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserExternalPrincipalsTest() throws ApiException {
        String userId = null;
        String prefix = null;
        String after = null;
        Integer amount = null;
        ExternalPrincipalList response = api.listUserExternalPrincipals(userId)
                .prefix(prefix)
                .after(after)
                .amount(amount)
                .execute();
        // TODO: test validations
    }

}
