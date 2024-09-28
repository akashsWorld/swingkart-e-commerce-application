'use client'
import Image from 'next/image'
import React from 'react'
import Button from './Button'
import { FaShoppingCart, FaRegUser } from "react-icons/fa";
import { CiShop } from "react-icons/ci";
import { IoIosMenu } from "react-icons/io";
const Navbar = () => {

  const onSearch = () => {
    console.log('search');
  }

  return (
    <nav className='h-16 flex items-center px-6 md:px-20 lg:px-32 gap-5 md:gap-8 lg:gap-12 justify-between overflow-hidden'>
      <div className='w-1/2 md:w-fit flex items-center h-fit flex-col md:flex-row gap-2 px-2 '>
        <Image src={'/e-commerce-2.png'} alt='e-commerce' height={50} width={50} className='w-7 lg:w-fit' />
        <h1 className='uppercase font-medium text-xs md:text-base lg:text-2xl bg-clip-text bg-primary-gradient text-transparent'>Swingkart</h1>
      </div>
      <input type="text" name="search-bar" id="searchBar" className='searchBar' onKeyDown={(e) => { e.key === 'Enter' ? onSearch() : null }} />
      <div className='w-1/2 flex items-center gap-4 justify-evenly'>
        <p className='h-fit items-center flex gap-2 cursor-pointer text-gray-700'>
          <FaShoppingCart className='text-xl cursor-pointer' />
          Cart
        </p>
        <div className='hidden md:flex gap-4'>
          <Button title='Login' icon={<FaRegUser className='text-base text-white' />} varient='btn__primary' onClick={() => { console.log('login') }} />
          <p className='text-gray-700font-medium text-base text-nowrap cursor-pointer hover:underline flex items-center gap-1'>
            <CiShop className='text-xl' />
            Become a Seller?
          </p>
        </div>
        <p className='md:hidden text-xl'>
          <IoIosMenu />
        </p>
      </div>


    </nav>
  )
}

export default Navbar
