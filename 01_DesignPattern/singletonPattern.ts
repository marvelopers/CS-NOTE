type Obj = {
  a: number;
};

const obj: Obj = {
  a: 27,
};

const obj2: Obj = {
  a: 27,
};

console.log(obj === obj2); //false

class Singleton {
  constructor() {
    if (!Singleton.instance) {
      Singleton.instance = this;
    }
    return Singleton.instance;
  }
  getInstance() {
    return this.instance;
  }
}

const a = new Singleton();
const b = new Singleton();

console.log(a === b); //true

const URL = "mongodb://localhost:27017/myapp";
const craeteConnection = (url: string) => ({ url: url });
class DB {
  constructor(url) {
    if (!DB.instance) {
      DB.instance = craeteConnection(url);
    }
    return DB.instance;
  }

  connect() {
    return this.instance;
  }
}

const x = new DB(URL);
const y = new DB(URL);

console.log(x === y); //true
