#protoc -I ./..  --python_out=./grpc ./../protobuf/catalog.proto
python -m grpc_tools.protoc --proto_path=./../ ./protobuf/catalog.proto --python_out=. --grpc_python_out=./grpc