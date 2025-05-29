SELECT sp.name FROM SalesPerson sp WHERE sp.sales_id NOT IN (select distinct o.sales_id from orders o
    join company c on o.com_id = c.com_id
    where c.name = 'RED');