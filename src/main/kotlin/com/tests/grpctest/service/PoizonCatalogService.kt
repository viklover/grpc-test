package com.tests.grpctest.service

class PoizonCatalogService : PoizonCatalogGrpcKt.PoizonCatalogCoroutineImplBase() {

    companion object {
        var count: Int = 0;
    }

    override suspend fun newProduct(request: Catalog.Product): Catalog.Response {
        return Catalog.Response.newBuilder().setMessage("Hello World! ${count++}").build();
    }
}
