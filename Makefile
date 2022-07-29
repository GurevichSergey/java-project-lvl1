
clean:
	./gradlew clean
build:
	./gradlew clean build
install:
	./gradlew clean install
run-dist: # запускаем файл app
	./build/install/app/bin/app
run:
	./gradlew run
test:
	./gradlew test
report:
	./gradlew jacocoTestReport
lint:
	./gradlew checkstyleMain checkstyleTest
update-deps:
	./gradlew useLatestVersions
