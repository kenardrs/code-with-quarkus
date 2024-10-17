INSERT INTO FRUTA (id, nome, qtd)
SELECT
    generate_series(1, 10) AS id,
    'maçã ' || generate_series(1, 10) AS nome,
    generate_series(1, 10) + 10 as qtd
;