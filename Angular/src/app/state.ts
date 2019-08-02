export class State {
    stateId:number;
    stateName:string;
}

export class City{
    cityId:number;
    stateId:number;
    cityName:string;
}

export class Hotel{
    hotelId:number;
    hotelName:string;
    hotelAddress:number;
    hotelStateId:number;
    hotelCityId:number;
    hotelPinCode:number;

}
