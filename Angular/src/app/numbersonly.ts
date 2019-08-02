import { FormControl } from '@angular/forms';

export class numbersonly{
        static invalidNumeric(control : FormControl):{ [key:string]:boolean }{
            if(control.value.length && !control.value.match(/^[0-9]{2,3}$/)){
                return {invalidNumeric : true}

            }
            return null
        }

}