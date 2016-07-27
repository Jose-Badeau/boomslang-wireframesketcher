#!/bin/bash

curl -T ./target/repository/artifacts.jar -uhbuender:dcf3076d7096ed50497ad4dae2ebe22f72d79a3b https://api.bintray.com/content/jose-badeau/boomslang-wireframesketcher/boomslangpackage/010/repository/
curl -T ./target/repository/content.jar -uhbuender:dcf3076d7096ed50497ad4dae2ebe22f72d79a3b https://api.bintray.com/content/jose-badeau/boomslang-wireframesketcher/boomslangpackage/010/repository/