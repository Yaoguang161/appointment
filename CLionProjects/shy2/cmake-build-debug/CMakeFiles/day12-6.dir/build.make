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
CMAKE_SOURCE_DIR = C:\Users\Asaki\CLionProjects\shy2

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/day12-6.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/day12-6.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/day12-6.dir/flags.make

CMakeFiles/day12-6.dir/day12/6.cpp.obj: CMakeFiles/day12-6.dir/flags.make
CMakeFiles/day12-6.dir/day12/6.cpp.obj: ../day12/6.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/day12-6.dir/day12/6.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\day12-6.dir\day12\6.cpp.obj -c C:\Users\Asaki\CLionProjects\shy2\day12\6.cpp

CMakeFiles/day12-6.dir/day12/6.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/day12-6.dir/day12/6.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\Asaki\CLionProjects\shy2\day12\6.cpp > CMakeFiles\day12-6.dir\day12\6.cpp.i

CMakeFiles/day12-6.dir/day12/6.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/day12-6.dir/day12/6.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\Asaki\CLionProjects\shy2\day12\6.cpp -o CMakeFiles\day12-6.dir\day12\6.cpp.s

# Object files for target day12-6
day12__6_OBJECTS = \
"CMakeFiles/day12-6.dir/day12/6.cpp.obj"

# External object files for target day12-6
day12__6_EXTERNAL_OBJECTS =

day12-6.exe: CMakeFiles/day12-6.dir/day12/6.cpp.obj
day12-6.exe: CMakeFiles/day12-6.dir/build.make
day12-6.exe: CMakeFiles/day12-6.dir/linklibs.rsp
day12-6.exe: CMakeFiles/day12-6.dir/objects1.rsp
day12-6.exe: CMakeFiles/day12-6.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable day12-6.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\day12-6.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/day12-6.dir/build: day12-6.exe

.PHONY : CMakeFiles/day12-6.dir/build

CMakeFiles/day12-6.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\day12-6.dir\cmake_clean.cmake
.PHONY : CMakeFiles/day12-6.dir/clean

CMakeFiles/day12-6.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\Users\Asaki\CLionProjects\shy2 C:\Users\Asaki\CLionProjects\shy2 C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug\CMakeFiles\day12-6.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/day12-6.dir/depend

