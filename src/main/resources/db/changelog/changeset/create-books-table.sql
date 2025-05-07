databaseChangeLog:
  - - changeSet:
        id: 3
        author: user
        changes:
          - createTable:
              tableName: books
              columns:
                - column:
                    name: book_id
                    type: SERIAL
                    constraints:
                      primaryKey: true
                - column:
                    name: user_id
                    type: INT
                    constraints:
                      foreignKeyName: fk_books_user
                      references: users(user_id)
                - column:
                    name: book_title
                    type: VARCHAR(255)

    - changeSet:
        id: 4
        author: user
        changes:
          - insert:
              tableName: books
              columns:
                - column: { name: book_id, valueNumeric: 1 }
                - column: { name: user_id, valueNumeric: 2 }
                - column: { name: book_title, value: Andersons tales }
          - insert:
              tableName: books
              columns:
                - column: { name: book_id, valueNumeric: 2 }
                - column: { name: user_id, valueNumeric: 2 }
                - column: { name: book_title, value: Anna Karenina }
          - insert:
              tableName: books
              columns:
                - column: { name: book_id, valueNumeric: 3 }
                - column: { name: user_id, valueNumeric: 1 }
                - column: { name: book_title, value: The Chronicles of Narnia }
          - insert:
              tableName: books
              columns:
                - column: { name: book_id, valueNumeric: 4 }
                - column: { name: user_id, valueNumeric: 1 }
                - column: { name: book_title, value: Walking through the torments }
