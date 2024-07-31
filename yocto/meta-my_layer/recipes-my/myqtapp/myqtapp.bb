DESCRIPTION = "This is a simple QT Hello World app"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS+= " qtbase wayland "

SRC_URI = "file://myqtapp.cpp \
           file://myqtapp.pro \
          "

S = "${WORKDIR}"

do_install:append() {
	install -d ${D}${bindir}
	install -m 0755 myqtapp ${D}${bindir}/
}

FILES_${PN} += "${bindir}/myqtapp"

inherit qt6-qmake
