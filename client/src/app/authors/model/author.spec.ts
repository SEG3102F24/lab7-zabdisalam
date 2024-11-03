import { Author } from './author';

describe('Author', () => {
  it('should create an instance', () => {
    expect(new Author(1, 'firstName', 'lastName')).toBeTruthy();
  });
});
