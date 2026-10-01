#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <errno.h>
int main(int argc,char**argv){
  if(argc!=5){fprintf(stderr,"usage: memread PID START_HEX LEN_HEX OUTFILE\n");return 2;}
  int pid=atoi(argv[1]);
  unsigned long long start=strtoull(argv[2],0,16);
  unsigned long long len=strtoull(argv[3],0,16);
  char path[64]; snprintf(path,sizeof path,"/proc/%d/mem",pid);
  int fd=open(path,O_RDONLY);
  if(fd<0){perror("open");return 3;}
  if(lseek(fd,(off_t)start,SEEK_SET)<0){perror("lseek");return 4;}
  int out=open(argv[4],O_WRONLY|O_CREAT|O_TRUNC,0666);
  if(out<0){perror("open out");return 5;}
  static char buf[65536]; unsigned long long done=0; ssize_t r,w;
  while(done<len){
    size_t want=(len-done>sizeof buf)?sizeof buf:(size_t)(len-done);
    r=read(fd,buf,want);
    if(r<=0){fprintf(stderr,"read stopped at %llu/%llu (errno=%d)\n",done,len,errno);break;}
    size_t o=0; while(o<r){w=write(out,buf+o,r-o); if(w<=0){perror("write");return 6;} o+=w;}
    done+=r;
  }
  fprintf(stderr,"read %llu/%llu bytes\n",done,len);
  return done==len?0:1;
}
