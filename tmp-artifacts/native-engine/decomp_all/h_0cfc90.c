// entry=0xcfc90

void Hcf1b4(void)

{
  char cVar1;
  char *in_x12;
  
  do {
    cVar1 = *in_x12;
    in_x12 = in_x12 + (0x76c1d50315b28a1a - (-DAT_00283df0 ^ 0xffffffffffffffffU));
  } while (cVar1 != '\0');
                    /* WARNING: Could not recover jumptable at 0x001cf97c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00281a40)();
  return;
}


