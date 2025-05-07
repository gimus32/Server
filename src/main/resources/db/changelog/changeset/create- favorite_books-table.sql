databaseChangeLog:
  - - changeSet:
        id: 5
        author: user
        changes:
          - createTable:
              tableName: favorite_books
              columns:
                - column:
                    name: favorite_book_id
                    type: SERIAL
                    constraints:
                      primaryKey: true
                - column:
                    name: user_id
                    type: INT
                    constraints:
                      foreignKeyName: fk_favbooks_user
                      references: users(user_id)
                - column:
                    name: book_id
                    type: INT
                    constraints:
                      foreignKeyName: fk_favbooks_book
                      references: books(book_id)

          - changeSet:
              id: 6
              author: user
              changes:
                - insert:
                    tableName: favorite_books
                    columns:
                      - column: { name: user_id, valueNumeric: 3 }
                      - column: { name: book_id, valueNumeric: 4 }
                - insert:
                    tableName: favorite_books
                    columns:
                      - column: { name: user_id, valueNumeric: 3 }
                      - column: { name: book_id, valueNumeric: 1 }
                - insert:
                    tableName: favorite_books
                    columns:
                      - column: { name: user_id, valueNumeric: 3 }
                      - column: { name: book_id, valueNumeric: 3 }
                - insert:
                    tableName: favorite_books
                    columns:
                      - column: { name: user_id, valueNumeric: 1 }
                      - column: { name: book_id, valueNumeric: 2 }
