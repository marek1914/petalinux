#
# This is the FLIR LEPTON Capture aplication recipe
#
#

SUMMARY = "FLIR LEPTON capture application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://flir-capture.c \
           file://Makefile \
        "
S = "${WORKDIR}"
CFLAGS_prepend = "-I ${S}/include"
do_compile() {
        oe_runmake
}
do_install() {
        install -d ${D}${bindir}
        install -m 0755 ${S}/flir-capture ${D}${bindir}

}
