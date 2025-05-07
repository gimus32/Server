databaseChangeLog:
  - - changeSet:
        id: 1
        author: user
        changes:
          - createTable:
              tableName: users
              columns:
                - column:
                    name: user_id
                    type: SERIAL
                    constraints:
                      primaryKey: true
                - column:
                    name: user_name
                    type: VARCHAR(255)
                - column:
                    name: user_pass
                    type: VARCHAR(255)
                - column:
                    name: user_age
                    type: INT
                - column:
                    name: user_email
                    type: VARCHAR(255)
                - column:
                    name: user_phone
                    type: VARCHAR(28)

  - changeSet:
      id: 2
      author: user
      changes:
        - insert:
            tableName: users
            columns:
              - column: {name: user_name, value: Nikita}
              - column: {name: user_pass, value: '8984'}
              - column: {name: user_age, valueNumeric: 13}
              - column: {name: user_email, value: nikitarussia27@gmail.com}
              - column: {name: user_phone, value: '89995550323'}
        - insert:
            tableName: users
            columns:
              - column: {name: user_name, value: Alexey}
              - column: {name: user_pass, value: '7956'}
              - column: {name: user_age, valueNumeric: 15}
              - column: {name: user_email, value: nikitarussia27@gmail.com}
              - column: {name: user_phone, value: '89047573734'}
        - insert:
            tableName: users
            columns:
              - column: {name: user_name, value: Sergey}
              - column: {name: user_pass, value: '4567'}
              - column: {name: user_age, valueNumeric: 22}
              - column: {name: user_email, value: nikitarussia27@gmail.com}
              - column: {name: user_phone, value: '89080880782'}
        - insert:
            tableName: users
            columns:
              - column: {name: user_name, value: Vovan}
              - column: {name: user_pass, value: '3224'}
              - column: {name: user_age, valueNumeric: 43}
              - column: {name: user_email, value: nikitarussia27@gmail.com}
              - column: {name: user_phone, value: '89954321221'}
        - insert:
            tableName: users
            columns:
              - column: {name: user_name, value: Fedya}
              - column: {name: user_pass, value: '7689'}
              - column: {name: user_age, valueNumeric: 67}
              - column: {name: user_email, value: nikitarussia27@gmail.com}
              - column: {name: user_phone, value: '89062343221'}
