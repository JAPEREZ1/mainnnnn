CREATE OR REPLACE VIEW customer_activity_view AS
SELECT
    c.id AS customer_id,
    c.full_name AS customer_name,
    c.email AS customer_email,
    l.status AS lead_status,
    l.source AS lead_source,
    a.description AS activity_description,
    a.date AS activity_date
FROM
    customer c
        LEFT JOIN lead l ON c.id = l.customer_id
        LEFT JOIN activity a ON l.id = a.customer_id;
