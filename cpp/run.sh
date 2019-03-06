rm -r -f $1/build/
mkdir $1/build
pushd $1/build
cmake -DBoost_NO_SYSTEM_PATHS=TRUE -DBOOST_ROOT=/usr/local/Cellar/boost@1.59/1.59.0 -G "Unix Makefiles" ..
make
pushd

