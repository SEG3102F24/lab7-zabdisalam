export class Book {
  constructor(
    public title: string,
  ) {}
}

export class Author {
  constructor(
    public id: number,
    public firstName: string,
    public lastName: string,
    public books: Book[]
  ){}
}
