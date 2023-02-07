package com.tests.grpctest

import com.tests.grpctest.service.PoizonCatalogService

import io.grpc.ServerBuilder

class GrpcTestApplication

fun main() {

    val server = ServerBuilder
        .forPort(8080)
        .addService(PoizonCatalogService())
        .build()

    server.start()
    server.awaitTermination()
}
