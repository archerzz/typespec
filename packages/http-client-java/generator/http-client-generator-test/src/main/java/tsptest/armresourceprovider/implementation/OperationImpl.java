// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package tsptest.armresourceprovider.implementation;

import tsptest.armresourceprovider.fluent.models.OperationInner;
import tsptest.armresourceprovider.models.ActionType;
import tsptest.armresourceprovider.models.Operation;
import tsptest.armresourceprovider.models.OperationDisplay;
import tsptest.armresourceprovider.models.Origin;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final tsptest.armresourceprovider.ArmResourceProviderManager serviceManager;

    OperationImpl(OperationInner innerObject, tsptest.armresourceprovider.ArmResourceProviderManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public Origin origin() {
        return this.innerModel().origin();
    }

    public ActionType actionType() {
        return this.innerModel().actionType();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private tsptest.armresourceprovider.ArmResourceProviderManager manager() {
        return this.serviceManager;
    }
}
