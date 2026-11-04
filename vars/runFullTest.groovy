import org.demo.Logger

def call() {
    // Phase 1: Retrieve data from the resources/ folder
    String configData = libraryResource('app-config.json')
    echo "Data retrieved from resources: ${configData}"

    // Phase 2: Call the Class from the src/ folder
    def myLogger = new Logger(this)
    myLogger.info("Class successfully executed from the src directory!")
    
    // Phase 3: Standard execution in vars/
    echo "Standard Structure Test completed successfully!"
}
