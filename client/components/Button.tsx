import React from 'react'
import Image from 'next/image';
export interface ButtonProps{
    title:string,
    onClick:()=>void,
    icon:React.ReactNode,
    varient:string;
}

const Button = ({onClick,title,icon,varient}:ButtonProps) => {


  return (
    <button onClick={onClick} className={`flex items-center gap-2 px-4 py-2 rounded-full ${varient}`}>
        {icon}
        <p className='text-white font-normal'>{title}</p>
    </button>
  )
}

export default Button
