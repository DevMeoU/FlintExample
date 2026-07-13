
APP_NAME         	:=  FlintApp
JC                  :=  javac
JAR					:=  jar

MAIN_CLASS			:=  Main
LIBS_DIR			:=  ../../../lib
SRC_DIR  			:=  src
OUT_DIR          	:=  bin

OPT             	:=  -g
LIBS				:=  $(LIBS_DIR)/*
JAVA_BASE			:=  $(LIBS_DIR)/java.base.jar
JFLAGS              :=  $(OPT) -Xlint:all -XDstringConcat=inline --system=none -encoding UTF-8 --module-path $(JAVA_BASE) -cp "$(LIBS)"

# Use Make's built-in wildcard so the build works on both Windows and Unix.
# Calling `find` here invokes Windows find.exe instead of the Unix file finder.
SOURCES 			:=  $(wildcard $(SRC_DIR)/*.java)
JAR_DIR				:=  $(OUT_DIR)/jar
BUILD_DIR			:=  $(OUT_DIR)/build
JAR_OUT				:=  $(JAR_DIR)/$(APP_NAME).jar

all: $(JAR_OUT)

build: Makefile
	@echo Compiling $(APP_NAME)
	@$(JC) $(JFLAGS) -d $(BUILD_DIR) $(SOURCES)

$(JAR_OUT): build Makefile
	@echo Creating $@
	@mkdir -p $(JAR_DIR)
	@$(JAR) c0fe $@ $(MAIN_CLASS) -C $(BUILD_DIR) "."

clean:
	@rm -rf $(OUT_DIR)
	@echo Clean complete
