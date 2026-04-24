# 2. Manuális teszt

### Limit levételre pl 30000
### Limit díja pl 2000

| balance | withdraw |    balance result            |
|---------|----------|------------------------------|
| 50000   |   5000   |    43000                     |
| 50000   | 60000    | hiba                         |
| -5000   | 5000     | hiba                         |
| 50000   | 40000    | hiba(nagy levétel)           |
| 2000    | 100      | hiba(díj miatt,nincs fedezet)|
