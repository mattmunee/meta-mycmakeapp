# meta-mycmakeapp
Yocto layer for adding CMake Hello World example custom Linux build

Add layer to yocto directory
```
$ cd poky
$ git clone https://github.com/mattmunee/meta-mycmakeapp.git
```

Initialize build environment

`$ source oe-init-build-env`

(This creates a folder "build" in /poky

Edit .../poky/build/conf/bblayers.conf and add meta-mycmakeapp to BBLAYERS:
```
BBLAYERS ?= " \
  .../poky/meta \
  .../poky/meta-poky \
  .../poky/meta-yocto-bsp \
  ...
  .../poky/meta-mycmakeapp \
  "
```
At the end of .../poky/build/conf/local.conf, add the mycmakeapp to the image installation:

`IMAGE_INSTALL_append = " bbexample mycmakeapp"`

Build the mycmakeapp recipe

`bitbake mycmakeapp`

Or just build the linux OS

`bitbake core-image-minimal`

In resulting root filesystem, the app will be placed at 

`/usr/bin/HelloWorld`
