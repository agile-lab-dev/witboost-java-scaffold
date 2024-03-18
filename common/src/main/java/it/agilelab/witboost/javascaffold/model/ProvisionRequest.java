package it.agilelab.witboost.javascaffold.model;

public record ProvisionRequest<T>(DataProduct dataProduct, Component<T> component, Boolean removeData) {}
