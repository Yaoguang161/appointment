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
include CMakeFiles/day02-x.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/day02-x.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/day02-x.dir/flags.make

CMakeFiles/day02-x.dir/day02/x.cpp.obj: CMakeFiles/day02-x.dir/flags.make
CMakeFiles/day02-x.dir/day02/x.cpp.obj: ../day02/x.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/day02-x.dir/day02/x.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\day02-x.dir\day02\x.cpp.obj -c C:\Users\Asaki\CLionProjects\shy2\day02\x.cpp

CMakeFiles/day02-x.dir/day02/x.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/day02-x.dir/day02/x.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\Asaki\CLionProjects\shy2\day02\x.cpp > CMakeFiles\day02-x.dir\day02\x.cpp.i

CMakeFiles/day02-x.dir/day02/x.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/day02-x.dir/day02/x.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\Asaki\CLionProjects\shy2\day02\x.cpp -o CMakeFiles\day02-x.dir\day02\x.cpp.s

# Object files for target day02-x
day02__x_OBJECTS = \
"CMakeFiles/day02-x.dir/day02/x.cpp.obj"

# External object files for target day02-x
day02__x_EXTERNAL_OBJECTS =

day02-x.exe: CMakeFiles/day02-x.dir/day02/x.cpp.obj
day02-x.exe: CMakeFiles/day02-x.dir/build.make
day02-x.exe: CMakeFiles/day02-x.dir/linklibs.rsp
day02-x.exe: CMakeFiles/day02-x.dir/objects1.rsp
day02-x.exe: CMakeFiles/day02-x.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable day02-x.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\day02-x.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/day02-x.dir/build: day02-x.exe

.PHONY : CMakeFiles/day02-x.dir/build

CMakeFiles/day02-x.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\day02-x.dir\cmake_clean.cmake
.PHONY : CMakeFiles/day02-x.dir/clean

CMakeFiles/day02-x.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\Users\Asaki\CLionProjects\shy2 C:\Users\Asaki\CLionProjects\shy2 C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug\CMakeFiles\day02-x.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/day02-x.dir/depend

