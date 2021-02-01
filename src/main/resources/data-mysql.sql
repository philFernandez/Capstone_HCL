insert into user (
    user_id, is_admin, password, username
) values (
    1, 0, '$2a$10$54.VVvIhnpPMfF4hujUKIes7a5/2A63fbNpVj4LIC7wGkv1i.lSt.', 'phil'
);

insert into role (
    id, name
) values (
    1, 'ROLE_USER'
);

insert into user_role (
    user_id, role_id
) values (
    1, 1
);

-- username: phil
-- password: pass123