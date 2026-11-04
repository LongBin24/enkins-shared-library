package org.demo

class Logger implements Serializable {
    def script
    Logger(script) {
        this.script = script
    }
    
    def info(String message) {
        script.echo("--> [LOGGER INFO]: ${message}")
    }
}
