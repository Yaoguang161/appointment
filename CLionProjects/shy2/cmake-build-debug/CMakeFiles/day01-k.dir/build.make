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
include CMakeFiles/day01-k.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/day01-k.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/day01-k.dir/flags.make

CMakeFiles/day01-k.dir/day01/k.cpp.obj: CMakeFiles/day01-k.dir/flags.make
CMakeFiles/day01-k.dir/day01/k.cpp.obj: ../day01/k.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/day01-k.dir/day01/k.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\day01-k.dir\day01\k.cpp.obj -c C:\Users\Asaki\CLionProjects\shy2\day01\k.cpp

CMakeFiles/day01-k.dir/day01/k.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/day01-k.dir/day01/k.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\Asaki\CLionProjects\shy2\day01\k.cpp > CMakeFiles\day01-k.dir\day01\k.cpp.i

CMakeFiles/day01-k.dir/day01/k.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/day01-k.dir/day01/k.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\Asaki\CLionProjects\shy2\day01\k.cpp -o CMakeFiles\day01-k.dir\day01\k.cpp.s

# Object files for target day01-k
day01__k_OBJECTS = \
"CMakeFiles/day01-k.dir/day01/k.cpp.obj"

# External object files for target day01-k
day01__k_EXTERNAL_OBJECTS =

day01-k.exe: CMakeFiles/day01-k.dir/day01/k.cpp.obj
day01-k.exe: CMakeFiles/day01-k.dir/build.make
day01-k.exe: CMakeFiles/day01-k.dir/linklibs.rsp
day01-k.exe: CMakeFiles/day01-k.dir/objects1.rsp
day01-k.exe: CMakeFiles/day01-k.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable day01-k.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\day01-k.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/day01-k.dir/build: day01-k.exe

.PHONY : CMakeFiles/day01-k.dir/build

CMakeFiles/day01-k.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\day01-k.dir\cmake_clean.cmake
.PHONY : CMakeFiles/day01-k.dir/clean

CMakeFiles/day01-k.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\Users\Asaki\CLionProjects\shy2 C:\Users\Asaki\CLionProjects\shy2 C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug C:\Users\Asaki\CLionProjects\shy2\cmake-build-debug\CMakeFiles\day01-k.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/day01-k.dir/depend

