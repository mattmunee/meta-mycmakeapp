DESCRIPTION = "cameracapture application" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r0" 

DEPENDS = "i2c-tools"
#FILESPATH = "/home/mattmunee/Desktop"
#SRC_URI = "file://CMakeCrossPlatform_HelloWorld"
SRC_URI = "git://github.com/mattmunee/CMakeCrossPlatform_HelloWorld.git;protocol=https;branch=master"
SRCREV="${AUTOREV}"
S = "${WORKDIR}/git/HelloWorld/HelloWorld"

inherit pkgconfig cmake

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
