import readline from 'readline'
import Snake from './Snake.js'
Snake.init();
readline.emitKeypressEvents(process.stdin)
process.stdin.setRawMode(true)

process.stdin.on('keypress', (_, key) => {
    if (key.ctrl && key.name === Snake.config.c) {
        console.log(Snake.config.turnedOff)
        process.exit(1)
    }
})


setInterval(()=> {
    console.clear()
    
    console.log(Snake.draw())
}, 1000)
