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
include CMakeFiles/day08-4.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/day08-4.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/day08-4.dir/flags.make

CMakeFiles/day08-4.dir/day08/4.cpp.obj: CMakeFiles/day08-4.dir/flags.make
CMakeFiles/day08-4.dir/day08/4.cpp.obj: ../day08/4.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=G:\appointment\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/day08-4.dir/day08/4.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\day08-4.dir\day08\4.cpp.obj -c G:\appointment\CLionProjects\shy2\day08\4.cpp

CMakeFiles/day08-4.dir/day08/4.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/day08-4.dir/day08/4.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E G:\appointment\CLionProjects\shy2\day08\4.cpp > CMakeFiles\day08-4.dir\day08\4.cpp.i

CMakeFiles/day08-4.dir/day08/4.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/day08-4.dir/day08/4.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S G:\appointment\CLionProjects\shy2\day08\4.cpp -o CMakeFiles\day08-4.dir\day08\4.cpp.s

# Object files for target day08-4
day08__4_OBJECTS = \
"CMakeFiles/day08-4.dir/day08/4.cpp.obj"

# External object files for target day08-4
day08__4_EXTERNAL_OBJECTS =

day08-4.exe: CMakeFiles/day08-4.dir/day08/4.cpp.obj
day08-4.exe: CMakeFiles/day08-4.dir/build.make
day08-4.exe: CMakeFiles/day08-4.dir/linklibs.rsp
day08-4.exe: CMakeFiles/day08-4.dir/objects1.rsp
day08-4.exe: CMakeFiles/day08-4.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=G:\appointment\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable day08-4.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\day08-4.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/day08-4.dir/build: day08-4.exe

.PHONY : CMakeFiles/day08-4.dir/build

CMakeFiles/day08-4.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\day08-4.dir\cmake_clean.cmake
.PHONY : CMakeFiles/day08-4.dir/clean

CMakeFiles/day08-4.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" G:\appointment\CLionProjects\shy2 G:\appointment\CLionProjects\shy2 G:\appointment\CLionProjects\shy2\cmake-build-debug G:\appointment\CLionProjects\shy2\cmake-build-debug G:\appointment\CLionProjects\shy2\cmake-build-debug\CMakeFiles\day08-4.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/day08-4.dir/depend

