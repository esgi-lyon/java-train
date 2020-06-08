obj:
	cd objet/ && javac Main.java && java Main

obj-deprec:
	cd objet/ javac -Xlint Main.java && java Main

tp:
    cd tp/ javac Main.java && java Main