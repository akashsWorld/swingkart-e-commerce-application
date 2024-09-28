import type { Config } from "tailwindcss";

const config: Config = {
  content: [
    "./pages/**/*.{js,ts,jsx,tsx,mdx}",
    "./components/**/*.{js,ts,jsx,tsx,mdx}",
    "./app/**/*.{js,ts,jsx,tsx,mdx}",
  ],
  theme: {
    extend: {
      colors: {
      },
      backgroundImage: {
        "primary-gradient": "linear-gradient(90deg, rgba(32,22,199,1) 0%, rgba(62,160,255,1) 100%)",
      }
    },
  },
  plugins: [],
};
export default config;

