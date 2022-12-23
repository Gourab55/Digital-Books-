import { ActionParent } from "../actions/todo.action";
import { Todo } from "../models/todo"
import { TodoActionType } from "../shared/todo-actions-types-enum";


const intialState: Todo[]=[
    {title: "Todo 1"},
    {title: "Todo 2"},
    {title: "Todo 3"}
];

export function TodoReducer(state=intialState,action: ActionParent)
{
    switch(action.type){
        case TodoActionType.add:
         return [...state, action.payload]
        default:return state;
    }
}