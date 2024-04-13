import {
    List,
    Datagrid,
    TextField,
    ReferenceField,
    EditButton,
    Edit,
    SimpleForm,
    ReferenceInput,
    TextInput,
} from "react-admin";

const postFilters = [
    <TextInput source="q" label="Search" alwaysOn />,
    <ReferenceInput source="userId" label="User" reference="users" />,
];

export const PostList = () => (
    <List filters={postFilters}>
        // ...
    </List>
);

export const PostEdit = () => (
    <Edit>
        <SimpleForm>
         <TextInput source="id" InputProps={{ disabled: true }} />
         <ReferenceInput source="userId" reference="users" link="show" />
         <TextInput source="title" />
         <TextInput source="body" multiline rows={5} />
        </SimpleForm>
    </Edit>
);