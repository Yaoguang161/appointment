# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.16

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "D:\CLion\CLion 2020.1\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "D:\CLion\CLion 2020.1\bin\cmake\win\bin\cmake.exe" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = G:\appointment\CLionProjects\shy2

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = G:\appointment\CLionProjects\shy2\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/day04-10.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/day04-10.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/day04-10.dir/flags.make

CMakeFiles/day04-10.dir/day04/10.cpp.obj: CMakeFiles/day04-10.dir/flags.make
CMakeFiles/day04-10.dir/day04/10.cpp.obj: ../day04/10.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=G:\appointment\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/day04-10.dir/day04/10.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\day04-10.dir\day04\10.cpp.obj -c G:\appointment\CLionProjects\shy2\day04\10.cpp

CMakeFiles/day04-10.dir/day04/10.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/day04-10.dir/day04/10.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E G:\appointment\CLionProjects\shy2\day04\10.cpp > CMakeFiles\day04-10.dir\day04\10.cpp.i

CMakeFiles/day04-10.dir/day04/10.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/day04-10.dir/day04/10.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S G:\appointment\CLionProjects\shy2\day04\10.cpp -o CMakeFiles\day04-10.dir\day04\10.cpp.s

# Object files for target day04-10
day04__10_OBJECTS = \
"CMakeFiles/day04-10.dir/day04/10.cpp.obj"

# External object files for target day04-10
day04__10_EXTERNAL_OBJECTS =

day04-10.exe: CMakeFiles/day04-10.dir/day04/10.cpp.obj
day04-10.exe: CMakeFiles/day04-10.dir/build.make
day04-10.exe: CMakeFiles/day04-10.dir/linklibs.rsp
day04-10.exe: CMakeFiles/day04-10.dir/objects1.rsp
day04-10.exe: CMakeFiles/day04-10.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=G:\appointment\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable day04-10.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\day04-10.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/day04-10.dir/build: day04-10.exe

.PHONY : CMakeFiles/day04-10.dir/build

CMakeFiles/day04-10.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\day04-10.dir\cmake_clean.cmake
.PHONY : CMakeFiles/day04-10.dir/clean

CMakeFiles/day04-10.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" G:\appointment\CLionProjects\shy2 G:\appointment\CLionProjects\shy2 G:\appointment\CLionProjects\shy2\cmake-build-debug G:\appointment\CLionProjects\shy2\cmake-build-debug G:\appointment\CLionProjects\shy2\cmake-build-debug\CMakeFiles\day04-10.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/day04-10.dir/depend

