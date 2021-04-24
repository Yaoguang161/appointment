cmake_minimum_required(VERSION 3.16)
project(shy)

set(CMAKE_CXX_STANDARD 14)

file(GLOB SOURCES
        boss.cpp
        employee.cpp
        manager.cpp
        workerManager.cpp
        main.cpp
        manager.h
        boss.h
        employee.h
        manager.h
        worker.h
        workerManager.h
        )
add_executable(ChainList main.cpp ${SOURCE_FILES} ${SOURCES})
