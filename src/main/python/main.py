import time

import grpc
import protobuf.catalog_pb2 as pb2

from protobuf.catalog_pb2_grpc import PoizonCatalogStub


def main():
    channel = grpc.insecure_channel('localhost:8080', options=(('grpc.enable_http_proxy', 0),))
    stub = PoizonCatalogStub(channel)

    while True:
        print(stub.NewProduct(pb2.Product(name="Hello", price=15)))
        time.sleep(0.1)


if __name__ == "__main__":
    main()
