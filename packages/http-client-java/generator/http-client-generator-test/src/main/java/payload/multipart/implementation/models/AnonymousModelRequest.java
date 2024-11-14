// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package payload.multipart.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import payload.multipart.models.ProfileImageFileDetails;

/**
 * The AnonymousModelRequest model.
 */
@Immutable
public final class AnonymousModelRequest {
    /*
     * The profileImage property.
     */
    @Generated
    private final ProfileImageFileDetails profileImage;

    /**
     * Creates an instance of AnonymousModelRequest class.
     * 
     * @param profileImage the profileImage value to set.
     */
    @Generated
    public AnonymousModelRequest(ProfileImageFileDetails profileImage) {
        this.profileImage = profileImage;
    }

    /**
     * Get the profileImage property: The profileImage property.
     * 
     * @return the profileImage value.
     */
    @Generated
    public ProfileImageFileDetails getProfileImage() {
        return this.profileImage;
    }
}