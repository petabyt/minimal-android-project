# Java 8 is *required*
# See https://gist.github.com/petabyt/c83094677995d90ee3757f8fb3d4c00a
gflag := -Dorg.gradle.java.home=$(shell echo ~/openlogic-openjdk-8u262-b10-linux-32)
gflag += --info

run:
	sudo gradle installDebug $(gflag)

comp:
	sudo gradle build $(gflag)

clean:
	rm -rf build .externalNativeBuild
