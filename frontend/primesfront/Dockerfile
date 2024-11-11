# Use the official Node.js image as a base image
FROM node:18-alpine

# Install bash
RUN apk add --no-cache bash

# Set the working directory
WORKDIR /app

# Copy the rest of the application code
COPY package*.json .

# Install dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Build the React app
RUN npm run build

# Expose the port that the app will run on
EXPOSE 3000

# Start the application
CMD ["npm", "start"]