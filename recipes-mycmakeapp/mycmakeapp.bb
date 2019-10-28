DESCRIPTION = "cameracapture application" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r0" 

DEPENDS = ""

SRC_URI = "git://github.com/mattmunee/CMakeCrossPlatform_HelloWorld.git;protocol=https;branch=master"
SRCREV="${AUTOREV}"
S = "${WORKDIR}/git/HelloWorld/Source"

inherit pkgconfig cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 HelloWorld ${D}${bindir}
}
