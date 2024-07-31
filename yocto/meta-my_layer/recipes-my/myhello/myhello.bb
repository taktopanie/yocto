DESCRIPTION = "This is a simple Hello World recipe - uses a local source file"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://myhello.c"

S = "${WORKDIR}"


python do_display_banner1() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*        compile myhello program              *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

python do_display_banner2() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*         install myhello program             *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}


addtask display_banner1 before do_compile
addtask display_banner2 before do_install

do_compile() {
	${CC} myhello.c ${LDFLAGS} -o myhello
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 myhello ${D}${bindir}
}
