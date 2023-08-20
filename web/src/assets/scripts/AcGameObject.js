const AC_GAME_OBJECTS = []

export class AcGameObject{
    constructor(){
        AC_GAME_OBJECTS.push(this);
        this.timeDelta = 0;
        this.have_called_start = false;
    }

    start(){}

    update(){}

    on_destroy(){}

    destroy(){
        this.on_destroy()
        for(let i in AC_GAME_OBJECTS){
            const obj = AC_GAME_OBJECTS[i]
            if(obj == this){
                AC_GAME_OBJECTS.splice(i)
                break
            }
        }
    }
}

let last_timestamp
const step = timestamp => {
    for(let obj of AC_GAME_OBJECTS){
        if(!obj.have_called_start){
            obj.have_called_start = true
            obj.start()
        } else {
            obj.timeDelta = timestamp - last_timestamp
            obj.update()
        }
    }
    last_timestamp = timestamp
    requestAnimationFrame(step)
}

requestAnimationFrame(step)