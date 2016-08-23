# boomslang-wireframesketcher
## Overview
boomslang-wireframesketcher is a wrapper around the ecore model of wireframesketcher. While wireframesketcher 
uses an ecore model internally the boomslang-wireframsketcher makes the model elements available to the other
boomslang components such as the boomslang-core language and the boomslang-geb generator.

## Contribute
To contribute to the boomslang-wireframesketcher just check out the respective branch, import the projects into 
Eclipse using "Import Existing Maven Projects". From the "com.wireframesketcher.targetplatform.remote" set the 
targetplatform. Finally, do a local maven clean install in the root folder. Now you are ready to go.

## Build
boomslang-wireframesketcher comes with a maven build that can be run locally using the standard maven installation.
Besides the local build there is also a travis-ci build engine running on the master branch. Since the outcome of the build is
a patch for the wireframesketcher model the build is executed in two steps. The first step is to generate all the modules and the
second step is executed within the remote.repository project to create the correct p2 repository. 
After a successful build the the repository is uploaded to a bintray repository. Before the upload is started the Directory Cleaner
tool (https://github.com/HBuender/DirectoryCleaner ) is run to delete the existing artifacts from the repository. In
future there might be a composite repository that can hold multiple versions.

## Installation
boomslang-wireframesketcher can be installed using the update-site at: https://dl.bintray.com/jose-badeau/boomslang-wireframesketcher/