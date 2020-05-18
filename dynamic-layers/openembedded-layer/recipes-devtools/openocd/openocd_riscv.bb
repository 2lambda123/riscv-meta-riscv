require recipes-devtools/openocd/openocd_git.bb

PV = "riscv"

SRC_URI = " \
    git://github.com/riscv/riscv-openocd.git;protocol=http;branch=riscv;name=openocd \
    git://repo.or.cz/r/git2cl.git;protocol=http;destsuffix=tools/git2cl;name=git2cl \
    git://repo.or.cz/r/jimtcl.git;protocol=http;destsuffix=git/jimtcl;name=jimtcl \
    git://repo.or.cz/r/libjaylink.git;protocol=http;destsuffix=git/src/jtag/drivers/libjaylink;name=libjaylink \
"

SRCREV_openocd = "4f9e2d7171f3cad8d1a99dff3eee5ec5e6d8ea2b"

COMPATIBLE_HOST = "(riscv32|riscv64).*-linux"
